import React from 'react';

export default function BookDetails({ books }) {
  return (
    <ul>
      {books.length === 0
        ? <li>No books available.</li>
        : books.map(book => (
            <li key={book.id}>
              <h3>{book.bname}</h3>
              <h4>Price: ${book.price}</h4>
            </li>
          ))
      }
    </ul>
  );
}
