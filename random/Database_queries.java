package com.random;

public class Database_queries {
	/*
	 1. select first 100 records in the table
	    "SELECT * FROM Customer LIMIT 100"
	    
	 2. Print second highest salary in the Employee table
	    # SELECT * FROM Employee ( select * from Employee order by SALARY desc limit 2) as Emp Order by SALARY limit 1
	 
	 3. What are the aggregate functions in SQL
	    	AVG – calculates the average of a set of values.
	    	COUNT – counts rows in a specified table or view.
			MIN – gets the minimum value in a set of values.
			MAX – gets the maximum value in a set of values.
			SUM – calculates the sum of values.
			
	 4. What are the different subsets of SQL?
DDL (Data Definition Language) – It allows you to perform various operations on the database such as CREATE, ALTER and DELETE objects.
DML ( Data Manipulation Language) – It allows you to access and manipulate data. It helps you to insert, update, delete and retrieve data from the database.
DCL ( Data Control Language) – It allows you to control access to the database. Example – Grant, Revoke access permissions.

     5. print duplicate rows in a table
        # select name, section from Table
          GROUP BY name, section 
          HAVING COUNT(*)>1
	 */
}
