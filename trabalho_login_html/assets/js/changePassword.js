const newPasswordInput = document.querySelector('#newPassword');
const confirmNewPasswordInput = document.querySelector('#confirmNewPassword');
const form = document.querySelector('.formLogin');

form.addEventListener('submit', (event) => {
    event.preventDefault();

    const newPassword = newPasswordInput.value;
    const confirmNewPassword = confirmNewPasswordInput.value;

    if (newPassword !== confirmNewPassword) {
        alert('As senhas não coincidem. Por favor, tente novamente.');
        newPasswordInput.value = "";
        confirmNewPasswordInput.value= "";
    } else {
        var users = JSON.parse(localStorage.getItem('users'));
        users.forEach(user => {
            if (user.loggedIn) {
                user.password = newPassword;
            }
        });
        localStorage.setItem('users', JSON.stringify(users));
        alert("Senha redefinida com sucesso!");
        window.location.href = '../pages/home.html';
    }
});
