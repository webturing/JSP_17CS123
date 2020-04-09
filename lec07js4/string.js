let s = "To know everything is to know nothing.";
console.log('UPPERCASE', s.toUpperCase());
console.log('LOWERCASE', s.toLowerCase());
let capitalize = function (s) {
    return s[0].toUpperCase() + s.substr(1).toLowerCase();

};
console.log('Capitalize:',capitalize("veryUglyWords"));
console.log(s.split(' ').map(capitalize));