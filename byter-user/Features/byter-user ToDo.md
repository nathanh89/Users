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
		  <td>A Byter user can use the camera from within the application to capture an image</td>
		  <td>
		    <ul>
		       <li> Given: A running Byter instance</li>
		       <li> When: I want to capture an image in Byter</li>
		       <li> Then: The camera can be accessed and an image captured</li>
		  </td>
		  <td>To-Do</td>
		</tr>
		<tr>
		  <td>Byter can analyze captured images</td>
		  <td>
		    <ul>
		       <li> Given: An image captured in Byter</li>
		       <li> When: I want to analyze the image for specific properties</li>
		       <li> Then: The image will be available for analyzation</li>
		       <li> And: Byter can check the image for specified properties</li>
		  </td>
		  <td>To-Do</td>
		</tr>		
		<tr>
		  <td>Byter can recognize UPC codes</td>
		  <td>
		    <ul>
		       <li> Given: An image captured by Byter</li>
		       <li> And: It is an image of a UPC code</li>
		       <li> When: I want to Byter to analyze the image</li>
		       <li> Then: Byter can identify the UPC code</li>
		  </td>
		  <td>To-Do</td>
		</tr>
		<tr>
		  <td>Byter can associate UPC codes with products</td>
		  <td>
		    <ul>
		       <li> Given: A UPC code in Byter</li>
		       <li> When: I want to know the associated product</li>
		       <li> Then: Byter can identify the product by the code</li>
		  </td>
		  <td>To-Do</td>
		</tr>	
		<tr>
		  <td>Byter can differentiate between food and non-food products</td>
		  <td>
		    <ul>
		       <li> Given: A UPC code in Byter</li>
		       <li> And: The code has been identified and linked to a product</li>
		       <li> When: Byter identifes the product</li>
		       <li> Then: Byter can determine if it is food or not</li>
		       <li> And: Inform the user as such if it is not food, and thus not proceed any further with that code</li>
		  </td>
		  <td>To-Do</td>
		</tr>
		<tr>
		  <td>Byter can get nutritional information for food products</td>
		  <td>
		    <ul>
		       <li> Given: An identified UPC code for a food product</li>
		       <li> And: I want to know the associated nutritional information for that product</li>
		       <li> Then: Byter can look up that information</li>
		       <li> And: Display it to the user</li>
		  </td>
		  <td>To-Do</td>
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
