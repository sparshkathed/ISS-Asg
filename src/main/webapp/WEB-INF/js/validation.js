function validateRegistration() {
	// Validate username
	var username = document.getElementById("regUsername").value;
	if (username.length < 8) {
		alert("Username must be at least 8 characters long");
		return false;
	}

	// Validate password
	var password = document.getElementById("regPassword").value;
	if (password.length < 8) {
		alert("Password must be at least 8 characters long");
		return false;
	}

	// Password complexity checks
	var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]/;
	if (!regex.test(password)) {
		alert("Password must contain at least one uppercase letter, one lowercase letter, one special symbol, and one number");
		return false;
	}

	// Validate confirm password
	var confirmPassword = document.getElementById("confirmPassword").value;
	if (confirmPassword !== password) {
		alert("Passwords do not match");
		return false;
	}

	return true; // Form is valid
}