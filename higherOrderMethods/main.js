const companies = [
  { name: "Company One", Category: "Financial", start: 1981, end: 2003 },
  { name: "Company Two", Category: "Retail", start: 1991, end: 2008 },
  { name: "Company Three", Category: "Auto", start: 1999, end: 2007 },
  { name: "Company Four", Category: "Retail", start: 1989, end: 2010 },
  { name: "Company Five", Category: "Technology", start: 2009, end: 2014 },
  { name: "Company Six", Category: "Financial", start: 1987, end: 2010 },
  { name: "Company Seven", Category: "Auto", start: 1986, end: 1996 },
  { name: "Company Eight", Category: "Technology", start: 2011, end: 2016 },
  { name: "Company Nine", Category: "Retail", start: 1981, end: 1989 }
];

const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];

// for (let i = 0; i < companies.length; i++) {
//   console.log(companies[i]);
// }

// forEach
// companies.forEach((company, index) => {
//   console.log(company.name, index);
// });

// Filter Get 21 or older
// const canDrink = ages.filter(age => {
//   if (age > 21) {
//     return true;
//   }
// });

// OR Filter Get 21 or older
// const canDrink = ages.filter(age => age > 21);

// filter only retail companies
// const retailCompanies = companies.filter(
//   company => company.Category === "Retail"
// );
// console.log(retailCompanies);

// filter all the company that start from the 1990
// const companies1980s = companies.filter(
//   company => company.start >= 1980 && company.start <= 1989
// );

// Filter get companies that last 10 years or more
// const lastedTenYears = companies.filter(
//   company => company.end - company.start >= 10
// );

// Map create array fo company names
// const companyNames = companies.map(company => company.name);
// const companyNames = companies.map(company => {
//   return `${company.name} [${company.start} - ${company.end}]`;
// });

// const agesSquare = ages.map(age => Math.sqrt(age));
// const agesTimes = ages.map(age => age * 2);

// // Using Double Map
// const ageMap = ages.map(age => Math.sqrt(age)).map(age => age * 2);
// console.log(ageMap);

// Sort
// sort companies
// const sortedCompanies = companies.sort((c1, c2) => {
//   if (c1.start > c2.start) {
//     return 1;
//   } else {
//     return -1;
//   }
// });
// const sortedCompanies = companies.sort((c1, c2) =>
//   c1.start > c2.start ? 1 : -1
// );

// Sort ages for ASC
// const sortAges = ages.sort((a, b) => a - b);

// Sort ages for DESC
// const sortAges = ages.sort((a, b) => b - a);

// Reduce: toestal ag all the ages in array
// const ageSum = ages.reduce((total, age) => total + age, 0);

// get total years for all companies
// const totalYears = companies.reduce(
//   (total, company) => total + (company.end - company.start),
//   0
// );

const combined = ages
  .map(age => age * 2)
  .filter(age => age >= 40)
  .sort((a, b) => a - b)
  .reduce((total, age) => total + age, 0);
console.log(combined);
