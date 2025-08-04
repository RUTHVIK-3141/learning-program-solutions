import React, { useState } from 'react';

/** Login / Logout buttons */
function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}
function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

/** Guest view (read-only flights) */
function GuestPage() {
  const flights = [
    { id: 1, from: 'NYC', to: 'LAX', time: '10:00 AM' },
    { id: 2, from: 'SFO', to: 'SEA', time: '2:30 PM' },
  ];
  return (
    <div>
      <h2>Available Flights (Guest)</h2>
      <ul>
        {flights.map(f => (
          <li key={f.id}>
            {f.from} → {f.to} @ {f.time}
          </li>
        ))}
      </ul>
      <p>Please log in to book tickets.</p>
    </div>
  );
}

/** Logged-in user view (ticket booking) */
function UserPage() {
  return (
    <div>
      <h2>Book Your Ticket</h2>
      <form onSubmit={e => { 
          e.preventDefault(); 
          alert('Ticket booked!'); 
        }}>
        <label>
          Flight ID:
          <input type="number" name="flightId" required />
        </label>
        <button type="submit">Book</button>
      </form>
    </div>
  );
}

/** Main App */
export default function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ padding: 20, fontFamily: 'sans-serif' }}>
      <header>
        {isLoggedIn
          ? <LogoutButton onClick={() => setIsLoggedIn(false)} />
          : <LoginButton  onClick={() => setIsLoggedIn(true)} />
        }
      </header>
      <main>
        {isLoggedIn ? <UserPage /> : <GuestPage />}
      </main>
    </div>
  );
}
