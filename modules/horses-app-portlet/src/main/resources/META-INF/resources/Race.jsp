<%@ include file="/init.jsp" %>


<p>
    <b><%!
    %><liferay-ui:message key="testactionmethod.caption"/></b>
</p>

<portlet:defineObjects/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<portlet:actionURL name="futures" var="secondMethodURL">
</portlet:actionURL>


<portlet:actionURL name="actionMethod1" var="sampleActionMethodURL">
</portlet:actionURL>


<head>
    <title>HorsesRace</title>
</head>
<body>
<aui:form action="<%=sampleActionMethodURL%>" method="POST">
    <br/>

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
</body>
<%--
<aui:form action="<%=secondMethodURL%>" method="post">
    <c:forEach  var = "RaceResult" items="${futures}" varStatus="ResultList" >
        <li>${RaceResult}</li>
    </c:forEach>

    <p><b>Results:</b>
            ${futures}
    </p>


    <aui:button type="submit" value="Results"/>
</aui:form>--%>
