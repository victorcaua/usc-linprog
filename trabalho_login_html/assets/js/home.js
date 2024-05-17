
document.addEventListener('DOMContentLoaded', (event) => {
    var users = JSON.parse(localStorage.getItem('users'));
    const loggedInUser = users.find(user => user.loggedIn);
    if (loggedInUser) {
        document.getElementById('welcome').textContent = 'Bem vindo, ' + loggedInUser.name;
    }
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


document.getElementById('gitHub').addEventListener('click', function() {
    window.location.href = 'https://github.com/victorcaua/usc-linprog/tree/main/trabalho_login_html';
});

document.getElementById('changePassword').addEventListener('click', function() {
    window.location.href = './changePassword.html';
});
