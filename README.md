# Portfolio-server
## My own portfolio api, spring and postgreeSQL, to get my experience with my projects and my course conclusion certificates

> status: developing

* actual condition: paused
  * reason: <p>to continue the develop process, i`will need buy my new laptop,<br>
            because i had problems with database in my actual pc when i was learning how to use postgreSql in SpringBoot aplications<br>
            that can be solved only with a total clean on my actual pc, and i cannot do it now, so, is better wait to buy the laptop<br>
            and try again</p>

### Summary

  The motivation for doing this project was because I need a portfolio to show people how to use what I know in practice, so,
it was just to try to build api`s complete with Spring, Java and PostgreSql universe
like database

  This api is very simple, and can be used ( or only make sense ) in my own website that has yet to be developed.
in it, will return JSON`s with objects that contains the metadata of each project, course and certificate mine

## TODO list

  ### General updates to do

  * Configure the swagger documentation

  * Configure the spring security
  * Trade the endpoint returns from normal objects to http ResponseEntity returns 
 
  * Connect with postgreSql database
    * Save the projects and courses in the database

  * finish the readme
    * Add all end points description
    * Add images representing the returns from endpoints to their descriptions in this readme file

  ### Endpoint ('/') updates to do
  
  * Create a complete page to show the main information about the api, can be simple, only to have not just a message in this return

  ### Endpoint ('/projects') updates to do

  * review HTTP methods

  ### Endpoint ('/courses') updates to do

  * review HTTP methods


----

## Objects

### Project
 _Each project object have the follow attributes_ 

<table>
    <tbody>
        <tr>
            <th>Type</th>
            <th>Identification</th>
        </tr>
        <tr>
            <td>String</td>
            <td>type</td>
        </tr>
        <tr>
            <td>String</td>
            <td>title</td>
        </tr>
        <tr>
            <td>String</td>
            <td>conclusionDate</td>
        </tr>
        <tr>
            <td>String</td>
            <td>resume</td>
        </tr>
        <tr>
            <td>String</td>
            <td>gitLink</td>
        </tr>
        <tr>
            <td>String</td>
            <td>imageLink</td>
        </tr>
    </tbody>
</table>

### Course

_Each course object have the follow attributes_

<table>
    <tbody>
        <tr>
            <th>Type</th>
            <th>Identification</th>
        </tr>
        <tr>
            <td>String</td>
            <td>type</td>
        </tr>
        <tr>
            <td>String</td>
            <td>title</td>
        </tr>
        <tr>
            <td>String</td>
            <td>conclusionDate</td>
        </tr>
        <tr>
            <td>String</td>
            <td>resume</td>
        </tr>
        <tr>
            <td>String</td>
            <td>gitLink</td>
        </tr>
        <tr>
            <td>String</td>
            <td>imageLink</td>
        </tr>
    </tbody>
</table>


----
## Return description of endpoints

### ('/')

* Will return just a message to check if the api is running correctly

### ('/projects')

* Will return as JSON with all objects that represents my did projects


### ('/courses')

* Will return as JSON with all objects that represents my complete courses

### ('/projects/{id}')

* Will return as JSON an objects that represents a specific project with the id passed

### ('/courses/{id}')

* Will return as JSON an objects that represents a specific course with the id passed

















