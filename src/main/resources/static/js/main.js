// main.js
// Entry point of the application
console.log('Application initialized');
console.log('Loading main.js...');
console.log('Initializing application...');
console.log('App is running...');
alert('Hello User');
let AGE = prompt('Please enter your age: ');
let firstName = 'John';
let lastName = 'Doe';
let age = 30;
let isEmployed = true;
let hobbies = ['reading', 'traveling', 'coding'];
let address = {
    street: '123 Main St',
    city: 'New York',
    state: 'NY',
    zip: '10001'
};
console.log('hello \nUser details: ', {
    firstName: firstName,
    lastName: lastName,
    age: age,
    isEmployed: isEmployed,
    hobbies: hobbies,
    address: address
});
let fullName = firstName + ' ' + lastName;
console.log(fullName);
function changeText(){
    document.getElementById('text').textContent= "java = javascript";
}

console.log('Happi bday' + AGE);

if(AGE >= 18) {
    console.log({'Age': AGE +' ' +'User is an adult'} );
    alert('You are an adult');
}
else {
    console.log('User is a miner');
}
//LOOP ON JS
for( let i = 0; i <= 1000; i++){
    console.log('I LOVE: ' + i);
}
let i = 2;
while(i <= 100){
    console.log(i);
    i+=2;
}