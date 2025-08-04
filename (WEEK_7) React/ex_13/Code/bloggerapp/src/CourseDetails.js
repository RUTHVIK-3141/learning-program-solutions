import React, { useState } from 'react';

const courses = [
  { id: 'angular', name: 'Angular', date: '4/5/2021' },
  { id: 'react',   name: 'React',   date: '6/3/2021'  },
];

export default function CourseDetails() {
  const [selected, setSelected] = useState('angular');
  const detail = courses.find(c => c.id === selected);

  return (
    <div>
      <select value={selected} onChange={e => setSelected(e.target.value)}>
        {courses.map(c => (
          <option key={c.id} value={c.id}>
            {c.name}
          </option>
        ))}
      </select>
      <div style={{ marginTop: '1rem' }}>
        <h3>{detail.name}</h3>
        <p>Start Date: {detail.date}</p>
      </div>
    </div>
  );
}
