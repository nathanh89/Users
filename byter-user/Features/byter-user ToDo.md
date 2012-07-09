<table>
	<thead>
		<tr>
		  <th>Feature</th>
		  <th>Story</th>
		  <th>Status</th>
		</tr>
	</thead>
	<tbody>
		<tr>
		  <td>A Byter user can have a name</td>
		  <td>
		    <ul>
		       <li> Given: A Byter user</li>
		       <li> When: That user wants to have a name</li>
		       <li> Then: They can set the name for themselves</li>
		       <li> And: Be able to check the name</li>
		  </td>
		  <td>DONE</td>
		</tr>
		<tr>
		  <td>A Byter user can have an email address</td>
		  <td>
		    <ul>
		       <li> Given: A Byter user</li>
		       <li> When: That user wants to have an email address</li>
		       <li> Then: They can set the email for themselves</li>
		       <li> And: Be able to check the email</li>
		  </td>
		  <td>DONE</td>
		</tr>
		<tr>
		  <td>A Byter user can only have a valid email address</td>
		  <td>
		    <ul>
		       <li> Given: A Byter user</li>
		       <li> When: That user wants to have an email address</li>
		       <li> And: They set the email for themselves to an invalid email address</li>
		       <li> Then: An exception will be thrown</li>
		       <li> And: The email address will not be set</li>
		  </td>
		  <td>DONE</td>
		</tr>
		<tr>
		  <td>A Byter user can only have a unique email address at creation</td>
		  <td>
		    <ul>
		       <li> Given: At least one existing Byter user</li>
		       <li> When: I create another user with an email address that another user has</li>
		       <li> And: They set the email for themselves to an invalid email address</li>
		       <li> Then: An exception will be thrown</li>
		       <li> And: The user will not be created</li>
		  </td>
		  <td>To-Do</td>
		</tr>
		<tr>
		  <td>A Byter user can have a password</td>
		  <td>
		    <ul>
		       <li> Given: A Byter user</li>
		       <li> When: That user wants to have a password</li>
		       <li> Then: The user can set the password</li>
		  </td>
		  <td>DONE</td>
		</tr>
		<tr>
		  <td>A Byter user must have a password at creation</td>
		  <td>
		    <ul>
		       <li> Given: A running Byter instance</li>
		       <li> When: A new user is created</li>
		       <li> And: A password isn't set</li>
		       <li> Then: An exception will be thrown</li>
		  </td>
		  <td>To-Do</td>
		</tr>
		<tr>
		  <td>A Byter user's password is encrytped</td>
		  <td>
		    <ul>
		       <li> Given: A Byter user</li>
		       <li> When: A password is created or recalled</li>
		       <li> Then: That password will be encrypted</li>
		  </td>
		  <td>To-Do</td>
		</tr>
		<tr>
		  <td>A Byter user's password is salted</td>
		  <td>
		    <ul>
		       <li> Given: A Byter user</li>
		       <li> When: A password is created or recalled</li>
		       <li> Then: That password will be salted</li>
		  </td>
		  <td>To-Do</td>
		</tr>
	</tbody>
</table>
