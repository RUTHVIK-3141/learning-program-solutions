import React from 'react';
import './App.css';

// 1. Array of office space objects
const offices = [
  {
    id: 1,
    name: 'DBS',
    rent: 50000,
    address: 'Chennai',
    img: '/images/office1.jpg' // put your image in public/images/
  },
  {
    id: 2,
    name: 'SkyWork',
    rent: 75000,
    address: 'Bengaluru',
    img: '/images/office2.jpg'
  },
  {
    id: 3,
    name: 'MetroHub',
    rent: 58000,
    address: 'Delhi',
    img: '/images/office3.jpg'
  }
];

function App() {
  return (
    <div className="App">
      {/* 2. Page heading */}
      <h1>Office Space, at Affordable Range</h1>
      
      {/* 3. Loop through offices */}
      {offices.map(({ id, name, rent, address, img }) => (
        <div key={id} className="office">
          {/* 4. Image attribute */}
          <img src={img} alt={`Office: ${name}`} />
          
          {/* 5. Details */}
          <h2>Name: {name}</h2>
          <h3
            className={
              rent < 60000 ? 'rent-low' : 'rent-high'
            }
          >
            Rent: Rs. {rent}
          </h3>
          <h3>Address: {address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;
