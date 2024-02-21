<%-- 
    Document   : employee
    Created on : Feb 15, 2024, 1:00:36 PM
    Author     : maciej milowicki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Employee Page</title>
    </head>
    <body>
        <h1>Create a new employee</h1>

        // the action is a reference to my Servlet
        <form method="post" action="/mmilowicki-fp/emp">
            <div>
                <label>Employee Id</label>
                <input type="text" id="empId" name="empId" />
            </div>

            <div>
                <label>First Name</label>
                <input type="text" id="firstName" name="firstName" />
            </div>

            <div>
                <label>Last Name</label>
                <input type="text" id="lastName" name="lastName" />
            </div>

            <div>
                <label>Title</label>
                <input type="text" id="title" name="title" />
            </div>

            <div>
                <label>Title of Courtesy</label>
                <-<!-- Here I'm going to do a drop-down menu instead of a text field.-->
                <select id="titleOfCourtesy" name="titleOfCourtesy">
                    <option value="1">Ms</option>
                    <option value="2">Mrs</option>
                    <option value="3">Mr</option>
                    <option value="4">Dr</option>
                </select>
            </div>

            <div>
                <-<!-- This is JUST a date example! One would NEVER allow a user to manually enter a CreateDate or LastUpdateDate-->
                <label>Birth Date</label>
                <input type="date" id="birthDate" name="birthDate" />
            </div>

            <div>
                <label>Date of Hire</label>
                <input type="date" id="hireDate" name="hireDate" />
            </div>

            <div> <-<!-- Prof uses "Email" here, I'm using "Address" field. -->
                <label>Address</label>
                <input type="text" id="address" name="address" />
            </div>

            <div>
                <label>City</label>
                <input type="text" id="city" name="city" />
            </div>

            <div>
                <label>Postal Code</label>
                <input type="text" id="postalCode" name="postalCode" />
            </div>

            <div>
                <label>Country</label>
                <input type="text" id="country" name="country" />
            </div>

            <div>
                <label>Phone Number</label>
                <input type="text" id="phone" name="phone" />
            </div>

            <div>
                <label>First Name</label>
                <input type="text" id="firstName" name="firstName" />
            </div>

            <button type="submit">Create Employee</button>
        </form>
    </body>
</html>
