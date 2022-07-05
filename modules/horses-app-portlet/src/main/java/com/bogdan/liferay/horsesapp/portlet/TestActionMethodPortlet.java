package com.bogdan.liferay.horsesapp.portlet;

import com.bogdan.liferay.horsesapp.constants.HorsesAppPortletKeys;
import com.bogdan.lifray.serviceapp.api.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author bogdan
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=HorsesAppPortlet",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + HorsesAppPortletKeys.horsesAppPortlet,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class TestActionMethodPortlet extends MVCPortlet {

    private static final Logger logger = Logger.getLogger(TestActionMethodPortlet.class.getName());
    private static final List<Horse> horses = HorseGenerator.generateHorses(Constants.HORS_SIZE);


    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

        renderRequest.setAttribute("bet", renderRequest.getParameter("bet"));

        renderRequest.setAttribute("horse", renderRequest.getParameter("horse"));

        renderRequest.setAttribute("result", renderRequest.getParameter("result"));

        super.render(renderRequest, renderResponse);
    }

    @ProcessAction(name = "actionMethod1")
    public void sampleActionMethod(ActionRequest request, ActionResponse response)
            throws SystemException {
        request.setAttribute("horses", horses);
    }

    @ProcessAction(name = "secondMethod2")
    public void secondMethod(ActionRequest request, ActionResponse response) throws SystemException {
        List<Race> races = horses.stream().map(Race::new).collect(Collectors.toList());
        ExecutorService executorService = Executors.newFixedThreadPool(Constants.HORSE_COUNT);

        try {
            List<Future<RaceResult>> results = executorService.invokeAll(races);
            request.setAttribute("results", printResults(results));
        } catch (InterruptedException e) {
            logger.log(Level.WARNING, "No horse on start line wtf..", e);
        } finally {
            executorService.shutdown();
        }


    }


    private void tryMethod() {
    }

    private List<RaceResult> printResults(List<Future<RaceResult>> results) {

        List<RaceResult> result = new ArrayList<>();
        try {
            for (Future<RaceResult> future : results) {
                result.add(future.get());
            }
            logger.log(Level.INFO, "Horse end run with result: {0}", result);
        } catch (InterruptedException | ExecutionException e) {
            logger.log(Level.WARNING, "Horse cant end run because GOD stop racing", e);
            Thread.currentThread().interrupt();
        }
        return result;
    }

}

