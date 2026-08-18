    // JSON Array
    let users = [
        {
            FirstName: "Sandra",
            LastName: "Rogers"
        },
        {
            FirstName: "Steve",
            LastName: "Casey"
        },
        {
            FirstName: "Michelle",
            LastName: "Michaels"
        }
    ];


    // Submit button
    document
        .getElementById("userForm")
        .addEventListener("submit", function(event) {

            // Prevent page refresh
            event.preventDefault();

            // Get input values
            let firstName =
                document.getElementById("firstName").value.trim();

            let lastName =
                document.getElementById("lastName").value.trim();


            // Validation
            if (firstName === "" || lastName === "") {
                alert("Please enter First Name and Second Name");
                return;
            }


            // Create JSON object
            let user = {
                FirstName: firstName,
                LastName: lastName
            };


            // Add object to JSON array
            users.push(user);


            // Clear input fields
            document.getElementById("firstName").value = "";
            document.getElementById("lastName").value = "";


            alert("User added successfully!");

        });


    // Display JSON button
    document
        .getElementById("displayBtn")
        .addEventListener("click", function() {

            // Convert JSON array to string
            let jsonData = JSON.stringify(users);

            // Display JSON
            document.getElementById("jsonOutput").textContent = jsonData;

        });
