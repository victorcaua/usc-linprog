
document.addEventListener('DOMContentLoaded', (event) => {
    const userEmailInput = document.querySelector('#userEmail');
    const form = document.querySelector('.formLogin');

    form.addEventListener('submit', (event) => {
        event.preventDefault();

        const email = userEmailInput.value;
        const userExists = users.some(user => user.email === email);

        if (userExists) {
            const newPassword = Math.random().toString(36).slice(-8);

            users = users.map(user => {
                if (user.email === email) {
                    return { ...user, password: newPassword };
                } else {
                    return user;
                }
            });

            localStorage.setItem('users', JSON.stringify(users));

            alert("Sua senha foi redefinida, utilize a senha: " + newPassword);
            userEmailInput.value="";
            
        } else {
            alert('Este e-mail não está cadastrado.'); 
            userEmailInput.value = "";
        }
    });
});
