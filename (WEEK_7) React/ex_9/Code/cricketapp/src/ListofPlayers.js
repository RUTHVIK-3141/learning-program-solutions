// src/ListofPlayers.js
import React from "react";

const ListofPlayers = ({ players }) => {
  const below70 = players.filter(p => p.score < 70);

  return (
    <div>
      <h1>List of Players</h1>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} – {p.score}</li>
        ))}
      </ul>
      <hr/>
      <h1>List of Players with Score {'<'} 70</h1>
      <ul>
        {below70.map((p, i) => (
          <li key={i}>{p.name} – {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
