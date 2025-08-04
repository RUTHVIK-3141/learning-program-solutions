import React, { useState } from 'react';

const RATE = 80;  // 1 € = 80 ₹

export default function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = e => {
    e.preventDefault();
    const amt = parseFloat(amount);
    if (isNaN(amt)) {
      alert('Please enter a number');
      return;
    }

    let result, label;
    if (currency.toLowerCase() === 'euro') {
      // ₹ → €
      result = (amt / RATE).toFixed(2);
      label = 'Euro';
    } else if (currency.toLowerCase() === 'inr') {
      // € → ₹
      result = (amt * RATE).toFixed(2);
      label = 'INR';
    } else {
      alert('Currency must be “Euro” or “INR”');
      return;
    }

    alert(`Converting to ${label} Amount is ${result}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2 style={{ color: 'green' }}>Currency Converter!!!</h2>
      <div>
        <label>
          Amount:&nbsp;
          <input
            type="text"
            value={amount}
            onChange={e => setAmount(e.target.value)}
          />
        </label>
      </div>
      <div style={{ marginTop: 8 }}>
        <label>
          Currency:&nbsp;
          <input
            type="text"
            placeholder="Euro or INR"
            value={currency}
            onChange={e => setCurrency(e.target.value)}
          />
        </label>
      </div>
      <div style={{ marginTop: 12 }}>
        <button type="submit">Convert</button>
      </div>
    </form>
  );
}
