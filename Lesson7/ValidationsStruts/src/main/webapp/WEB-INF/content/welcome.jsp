<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="welcome.title"/></title>
        <s:head/>
    </head>
    <body>
        <h1>¡<s:text name="welcome.title"/>!</h1>
        <s:actionmessage/>
        <s:actionerror/>
        <h2> <s:text name="welcome.message"/> </h2>
        
        <p> 
            <s:text name="form.usuario"/>: <s:property value="usuario"/> <br>
            <s:text name="form.password"/>: <s:property value="password"/> <br>
        </p>
        <a href="<s:url action="login"/>">  <s:text name="welcome.return"/> </a>
    </body>
</html>
