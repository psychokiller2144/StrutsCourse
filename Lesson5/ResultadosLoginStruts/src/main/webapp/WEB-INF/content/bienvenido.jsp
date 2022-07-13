<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <title> <s:text name="bienvenido.titulo" /> </title>
    </head>
    
    <body>
        <h1><s:text name="bienvenido.titulo" /></h1>
        
        <h2>  <s:text name="bienvenido.mensaje" /> </h2>
        
        <p> <s:text name="form.usuario" /> : <s:property value="usuario"/>  </p>
        
        <p> <s:text name="form.password" /> : <s:property value="password"/>  </p>
        
   
    </body>
</html>
