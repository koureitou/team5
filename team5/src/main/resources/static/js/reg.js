/**
 * 
 */
const passwordInput = document.querySelector('input[type="password"]');
let openleft = document.querySelector('.openleft');
let openright = document.querySelector('.openright')

passwordInput.addEventListener('focus', function() {
  openleft.classList.remove('openleft');
  openleft.classList.add('closeleft');
  openright.classList.remove('openright');
  openright.classList.add('closeright');
});

passwordInput.addEventListener('blur', function() {
    openleft.classList.add('openleft');
    openleft.classList.remove('closeleft');
    openright.classList.add('openright');
    openright.classList.remove('closeright');
  });

