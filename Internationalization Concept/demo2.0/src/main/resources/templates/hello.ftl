<#import "spring.ftl" as spring>
<html>
	<head>
		<link rel="stylesheet" href="greenTable.css">
	</head>
		
	<body>
		
		<a href="/?language=fr">france</a>
		<h1><@spring.message "welcome.message"/></h1>
		<h1>Hello FTL page</h1>
		
		<h3>Model Attribute </h3>
		<h6>${name}<h6>
		<h1>message from backend ${message} </h1>
		
		<h3>list is here</h3>
		<#list list as l>
			<h6>${l}</h6>
		</#list>
		
		
		<h3>List of Employees</h3>
		
		<table border="1" id="customers">
			<th>EmpId</th>
			<th>EmpName</th>
			<th>EmpOraganization</th>
			<#list empList as empl>
				<tr>
					<td>${empl.empId}</td>
					<td>${empl.empName}</td>
					<td>${empl.organization}</td>
				</tr>
			</#list>
		</table>
	</body>
</html>