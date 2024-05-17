
document.addEventListener('DOMContentLoaded', (event) => {
    const togglePassword = document.querySelector('#privacyPassword');
    const passwordInput = document.querySelector('#userPassword');

    togglePassword.addEventListener('click', () => {
        const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
        passwordInput.setAttribute('type', type);
        
        if (type === 'password') {
            togglePassword.classList.remove('fa-unlock');
            togglePassword.classList.add('fa-lock');
        } else {
            togglePassword.classList.remove('fa-lock');
            togglePassword.classList.add('fa-unlock');
        }
    });
});

const userEmailInput = document.querySelector('#userEmail');
const userPasswordInput = document.querySelector('#userPassword');
const form = document.querySelector('.formLogin');

form.addEventListener('submit', (event) => {
    event.preventDefault();

    const email = userEmailInput.value;
    const password = userPasswordInput.value;

    var users = JSON.parse(localStorage.getItem('users'));
    const user = users.find(user => user.email == email);

    if (!user) {
        alert("O e-mail informado não está cadastrado");
        userEmailInput.value = "";
        userPasswordInput.value= "";
        window.location.href = './pages/cadastro.html';
    } else if (user.password !== password) {
        alert('Senha incorreta. Por favor, tente novamente.');
        userEmailInput.value = "";
        userPasswordInput.value= "";
    } else {
        userEmailInput.value = "";
        userPasswordInput.value= "";
        users.forEach(user => {
            user.loggedIn = false;
        });
        user.loggedIn = true;
        localStorage.setItem('users', JSON.stringify(users));
        window.location.href = './pages/home.html'; 
    }
});

