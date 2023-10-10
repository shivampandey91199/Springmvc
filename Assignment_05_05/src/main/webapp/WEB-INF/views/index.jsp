<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
        }
        .form-group input[type="text"],
        .form-group input[type="email"],
        .form-group input[type="password"],
        .form-group input[type="tel"],
        .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-group .radio-label {
            font-weight: bold;
        }
        .form-group .radio-label input[type="radio"] {
            margin-right: 5px;
        }
        .form-group .profile-pic-label {
            display: flex;
            align-items: center;
        }
        .form-group .profile-pic-label input[type="file"] {
            margin-right: 10px;
        }
        .btn-submit {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>User Registration Form</h2>
        <form action="register">
            <div class="form-group">
                <label for="id">ID:</label>
                <input type="text" id="id" name="id" required>
            </div>
            <div class="form-group">
                <label for="firstname">First Name:</label>
                <input type="text" id="firstname" name="firstname" required>
            </div>
            <div class="form-group">
                <label for="lastname">Last Name:</label>
                <input type="text" id="lastname" name="lastname" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="tel" id="mobile" name="mobile" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label>Gender:</label>
                <div class="radio-label">
                    <input type="radio" id="male" name="gender" value="male">
                    <label for="male">Male</label>
                </div>
                <div class="radio-label">
                    <input type="radio" id="female" name="gender" value="female">
                    <label for="female">Female</label>
                </div>
                <div class="radio-label">
                    <input type="radio" id="other" name="gender" value="other">
                    <label for="other">Other</label>
                </div>
            </div>
            <div class="form-group">
                <label for="profile_pic">Profile Picture:</label>
                <div class="profile-pic-label">
                    <input type="file" id="profile_pic" name="profile_pic">
                    <span>Upload a profile picture</span>
                </div>
            </div>
            <button type="submit" name="action" value="register"class="btn-submit">Register</button>
        </form>
    </div>
    <script>
        document.getElementById("registration-form").addEventListener("submit", function (e) {
            e.preventDefault();
            
            // Get form data
            const formData = new FormData(this);
            
            // Convert FormData to JSON
            const formDataJSON = {};
            formData.forEach((value, key) => {
                formDataJSON[key] = value;
            });
            
            // Display form data in JSON format
            alert(JSON.stringify(formDataJSON, null, 2));
        });
    </script>
</body>
</html>
