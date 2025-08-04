// src/App.js
import React from "react";
import ListofPlayers from "./ListofPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {
  const flag = true;  // change to false to see IndianPlayers
  const players = [
    { name: "Mr. Jack", score: 50 },
    { name: "Mr. Michael", score: 70 },
    { name: "Mr. John", score: 40 },
    // … add all 11 …
  ];

  const IndianTeam     = ["Sachin1","Dhoni2","Virat3","Rohit4","Raina6","Yuvaraj5"];
  const T20players     = ["First Player","Second Player","Third Player"];
  const RanjiTrophy    = ["Fourth Player","Fifth Player","Sixth Player"];
  const mergedPlayers  = [...T20players, ...RanjiTrophy];

  return (
    <div className="App">
      {flag
        ? <ListofPlayers players={players} />
        : <IndianPlayers team={IndianTeam} merged={mergedPlayers} />
      }
    </div>
  );
}

export default App;
