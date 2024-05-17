
var loggedInUser = JSON.parse(localStorage.getItem('loggedInUser'));

if (loggedInUser) {
    document.getElementById('welcome').textContent = 'Bem vindo, ' + loggedInUser.name;
}

document.getElementById('gitHub').addEventListener('click', function() {
    window.location.href = '';
});

document.getElementById('logout').addEventListener('click', function() {
    localStorage.removeItem('loggedInUser');
    window.location.href = '../index.html';
});

document.getElementById('changePassword').addEventListener('click', function() {
    window.location.href = './changePassword.html';
});

document.getElementById('logout').addEventListener('click', function() {
    var users = JSON.parse(localStorage.getItem('users'));
    users.forEach(user => {
        if (user.loggedIn) {
            user.loggedIn = false;
        }
    });
    localStorage.setItem('users', JSON.stringify(users));
    window.location.href = '../index.html';
});
