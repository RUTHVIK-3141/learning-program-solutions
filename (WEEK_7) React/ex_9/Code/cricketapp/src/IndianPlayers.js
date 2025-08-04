// src/IndianPlayers.js
import React from "react";

const IndianPlayers = ({ team, merged }) => {
  const odd = team.filter((_, i) => i % 2 === 0);
  const even = team.filter((_, i) => i % 2 !== 0);

  return (
    <div>
      <h1>Indian Team</h1>

      <h2>Odd Players</h2>
      <ul>
        {odd.map((name, i) => <li key={i}>{name}</li>)}
      </ul>
      <hr/>

      <h2>Even Players</h2>
      <ul>
        {even.map((name, i) => <li key={i}>{name}</li>)}
      </ul>
      <hr/>

      <h1>Merged Players</h1>
      <ul>
        {merged.map((name, i) => <li key={i}>{name}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
