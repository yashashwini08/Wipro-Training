const express = require('express')
const path = require('path')
const app = express()
const port = 3000

// Serve static files from the "public" directory
app.use(express.static('public'))

// Route for the home page
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'index.html'))
})

// Route for the about page
app.get('/about', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'about.html'))
})

app.use(express.json()); // Add this if not present

app.post('/check-palindrome', (req, res) => {
  const { number } = req.body;
  if (typeof number !== 'string' && typeof number !== 'number') {
    return res.json({ result: 'Invalid input' });
  }
  const str = number.toString();
  const isPalindrome = str === str.split('').reverse().join('');
  res.json({ result: isPalindrome ? `${number} is a palindrome` : `${number} is not a palindrome` });
});

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}`)
})