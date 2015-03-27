<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<link href="<s:url value="/resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<s:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.employees"/></title>
</head>
<body>
<center>
<h1>
   <s:if test="employee==null || employee.employeeId == null">
	 <s:text name="label.employee.add"/>
   </s:if>
   <s:else>
	 <s:text name="label.employee.edit"/>
   </s:else>
</h1>
	<table >
	    <tr><td><a href="getAllEmployees.action">View Employees</a></td></tr>
	</table>	 
	 <table>
		<tr><td align="left" style="font:bold;color:red"> 
	            <s:fielderror/> 	 	
                <s:actionerror/>
                <s:actionmessage/></td></tr>
     </table>		 	
    <s:form>
     <table>
     	 
         <tr><td class="tdLabel"><s:text name="label.firstName"/></td>
         	        <td><s:textfield name="employee.firstName" size="30"/></td>
         </tr>
        <tr>
            <td class="tdLabel"><s:text name="label.lastName"/></td>
                            <td><s:textfield name="employee.lastName" size="30"/></td>
        </tr>
        <tr><td class="tdLabel"><s:text name="label.age"/></td>
        	                <td><s:textfield name="employee.age" size="20"/></td>
        </tr>
         <tr>
            <td class="tdLabel"><s:text name="label.department"/></td>
            <td><s:select name="employee.department.departmentId" 
                list="#session.departments" 
                listKey="departmentId" 
                listValue="name"
                />
            </td>
             <s:hidden name="employee.employeeId"/>
        </tr>
    </table>
    		 <br/>
    <table> 
    	     <tr>
    		    <td><s:submit  action="insertOrUpdate" key="button.label.submit" cssClass="btn btn-primary"/></td>    
    		 <tr>
    </table> 		  		 
    	</s:form>
</center>		
</body>
</html>