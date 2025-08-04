import React, { useState } from 'react';
import BookDetails    from './BookDetails';
import BlogDetails    from './BlogDetails';
import CourseDetails  from './CourseDetails';

const sampleBooks = [
  { id: 1, bname: 'Master React',          price: 670 },
  { id: 2, bname: 'Deep Dive into Angular', price: 800 },
  { id: 3, bname: 'Mongo Essentials',        price: 450 },
];

function App() {
  const [showBooks,  setShowBooks]  = useState(true);
  const [showBlog,   setShowBlog]   = useState(true);
  const [showCourse, setShowCourse] = useState(true);

  // element variable pattern
  const courseSection = showCourse ? <CourseDetails /> : null;

  return (
    <div style={{ display: 'flex', gap: '2rem', padding: '1rem' }}>
      <div style={{ position: 'fixed', top: 10, right: 10 }}>
        <button onClick={() => setShowBooks(b => !b)}>Toggle Books</button>
        <button onClick={() => setShowBlog(b  => !b)}>Toggle Blog</button>
        <button onClick={() => setShowCourse(c => !c)}>Toggle Courses</button>
      </div>

      <div>
        <h1>Book Details</h1>
        { showBooks && <BookDetails books={sampleBooks} /> }
      </div>

      <div>
        <h1>Blog Details</h1>
        { showBlog 
          ? <BlogDetails /> 
          : <em>Blog is hidden.</em>
        }
      </div>

      <div>
        <h1>Course Details</h1>
        { courseSection }
      </div>
    </div>
  );
}

export default App;
