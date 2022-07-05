<%@ taglib prefix="liferay-export-import-changeset" uri="http://liferay.com/tld/export-import-changeset" %>
<%@ include file="/init.jsp" %>

<portlet:defineObjects/>

<portlet:actionURL name="secondMethod2" var="secondMethodURL">
</portlet:actionURL>


<portlet:actionURL name="actionMethod1" var="sampleActionMethodURL">
</portlet:actionURL>

<body>


<aui:form action="<%=sampleActionMethodURL%>" method="POST">

    <c:forEach var="Horse" items="${horses}" varStatus="horsesList">


        <aui:input type="radio" name="horse" value="${Horse}"/>${Horse}


    </c:forEach>


    <br/>
    Choose your horse and make a bet
    <br/>


    Bet: <aui:input type="number" name="bet"/>


    <p><b>Bet:</b>
            ${bet}
    </p>
    <p><b>Horse number:</b>
            ${horse}
    </p>

    <aui:button type="submit" value="GenerateHorses"/>

</aui:form>

<aui:form action="<%=secondMethodURL%>" method="post">

    <c:forEach items="${results}" var="raceResult">

        <li>${raceResult}</li>

    </c:forEach>

    <aui:button type="submit" value="Results"/>

</aui:form>

<entity name="HorsesListEntry" local-service="true" uuid="true" remote-service="true">
    <column name="id" type="long" primary="true"/>
    <column name="modelSpeed" type="int"/>
</entity>

</body>

