<html><!DOCTYPE html>
<html>
<head>
  <title>Get ID and Name</title>
</head>
<body>
  <form action=addUser>
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required><br><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <input type="submit" value="Submit">
  </form>
  
  <h2>to get the user details</h2>
  <form action=getUser>
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required><br><br>

    <input type="submit" value="Submit">
  </form>
  
  <h2>to delete the user</h2>
  <form action=deleteUser>
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required><br><br>

    <input type="submit" value="Submit">
  </form>
  
   <h2>enter details to update</h2>
  <form action=updateUser>
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required><br><br>

    <input type="submit" value="Submit">
  </form>
  
</body>
</html>