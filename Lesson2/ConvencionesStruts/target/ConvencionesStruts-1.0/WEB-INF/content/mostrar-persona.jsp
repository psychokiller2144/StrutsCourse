
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Persona</title>
    </head>
    <body>
   
        <h1>Personas con struts</h1>
        <s:form>
            <s:textfield name="nombre"/>
            <s:submit value="enviar"/>
        
        </s:form>
        
        <div>
            <p> Nombre proporcionado: <s:property value="nombre"/> </p>
            <p> <s:property value="saludoPersonalizado"/> </p>
        </div>
        
        
    </body>
</html>
