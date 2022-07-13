
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Name Collector</title>
    </head>
    <body>
        <h1>Ingresa tu Nombre</h1>
        <s:form>
            <s:textfield name="name"/>
            <s:submit value="Enviar"/>
        </s:form>
        <div>
            <p> El nombre proporcionado es: <s:property value="name"/> </p>
            <p> <s:property value="customGreeting"/> </p>
        </div>        
    </body>
</html>
