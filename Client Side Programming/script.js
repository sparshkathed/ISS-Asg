function validateForm(event) {
    event.preventDefault();
  
    var employeeId = document.getElementById("employeeId").value;
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var aadhar = document.getElementById("aadhar").value;
    var errorMessage = document.getElementById("errorMessage");
  
    // Simple validation for demonstration purposes
    if (employeeId.trim() === '' || name.trim() === '' || email.trim() === '' || phone.trim() === '' || aadhar.trim() === '') {
      errorMessage.textContent = "All fields are required";
      return;
    }
  
    // Regular expressions for validation
    var employeeIdRegex = /^\d{5}$/;
    var aadharRegex = /^\d{12}$/;
    var phoneRegex = /^[0-9]{10}$/;
  
    if (!employeeIdRegex.test(employeeId)) {
      errorMessage.textContent = "Employee ID must be 5 digits";
      return;
    }
  
    if (!phoneRegex.test(phone)) {
      errorMessage.textContent = "Invalid phone number";
      return;
    }
  
    if (!aadharRegex.test(aadhar)) {
      errorMessage.textContent = "Aadhar card must be 12 digits";
      return;
    }
  
    // You can add more advanced validation here
  
    // If all validations pass, submit the form
    errorMessage.textContent = "";
    // You can submit the form data to the server here
    alert("Form submitted successfully!");
  }
  