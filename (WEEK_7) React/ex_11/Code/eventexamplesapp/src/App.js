import React, { useState } from 'react';
import CurrencyConverter from './CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  // a) increment
  const increment = () => setCount(c => c + 1);

  // b) say hello
  const sayHello = () => alert('Hello Member!');

  // composite handler for “Increment”
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // “Decrement” handler
  const handleDecrement = () => setCount(c => c - 1);

  // “Say Welcome” takes an argument
  const sayWelcome = msg => alert(msg);

  // synthetic “OnPress” demo
  const handlePress = e => {
    // e is a React SyntheticEvent
    alert('I was clicked');
  };

  return (
    <div style={{ padding: 20, fontFamily: 'sans-serif' }}>
      <h1>Event Examples App</h1>

      <div>
        <p>Counter: {count}</p>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
      </div>

      <div style={{ marginTop: 20 }}>
        <button onClick={() => sayWelcome('Welcome!')}>Say Welcome</button>
      </div>

      <div style={{ marginTop: 20 }}>
        <button onClick={handlePress}>Click on me</button>
      </div>

      <hr style={{ margin: '40px 0' }} />

      <CurrencyConverter />
    </div>
  );
}

export default App;
