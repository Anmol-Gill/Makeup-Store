// View Details buttons on product cards
document.addEventListener("DOMContentLoaded", function() {
    //View Details buttons
    var detailButtons = document.querySelectorAll('.btn-primary');

    // Loop through each button and add a click event listener
    detailButtons.forEach(function(button) {
        button.addEventListener('click', function(event) {
            event.preventDefault();
            // Show an alert when the button is clicked
            alert('More details coming soon! Stay tuned for updates on this product.');
        });
    });
});

// Validation for the contact form
document.addEventListener("DOMContentLoaded", function() {
    var contactForm = document.querySelector('form');
    if (contactForm) {
        contactForm.addEventListener('submit', function(event) {
            var name = document.getElementById('name').value;
            var email = document.getElementById('email').value;
            var message = document.getElementById('message').value;

            if (name === "" || email === "" || message === "") {
                event.preventDefault();
                alert('Please fill out all fields before submitting the form.');
            }
        });
    }
});
