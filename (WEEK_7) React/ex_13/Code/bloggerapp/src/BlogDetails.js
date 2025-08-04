import React, { useState } from 'react';

export default function BlogDetails() {
  const [showInstall, setShowInstall] = useState(false);

  if (!showInstall) {
    return (
      <div>
        <h2>React Learning</h2>
        <p><strong>Stephen Biz</strong></p>
        <button onClick={() => setShowInstall(true)}>
          Show Installation
        </button>
      </div>
    );
  }

  return (
    <div>
      <h2>Installation</h2>
      <p><strong>Schewzdiener</strong></p>
      <p>You can install React from npm.</p>
    </div>
  );
}
