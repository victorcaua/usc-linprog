
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

const userNameInput = document.querySelector('#userName');
const userEmailInput = document.querySelector('#userEmail');
const userPasswordInput = document.querySelector('#userPassword');
const form = document.querySelector('.formLogin');

form.addEventListener('submit', (event) => {
    event.preventDefault();

    const email = userEmailInput.value;
    const userExists = users.some(user => user.email === email);

    if (userExists) {
        alert('Este e-mail já está cadastrado.'); 
        userEmailInput.value = "";
        userPasswordInput.value= "";
        userNameInput.value = "";
    } else {
        const userNameInput = document.querySelector('#userName');
        const userPasswordInput = document.querySelector('#userPassword');

        const name = userNameInput.value;
        const password = userPasswordInput.value;

        users.push({ name, email, password }); 

        localStorage.setItem('users', JSON.stringify(users));

        userEmailInput.value = "";
        userPasswordInput.value= "";
        userNameInput.value = "";
        
        window.location.href = './home.html';
    }
});
