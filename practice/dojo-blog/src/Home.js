import { useState } from "react";

const Home = () => {
  const title = "NewTown Dogs";
  const [name, setName] = useState("Oayk");
  const [age, setAge] = useState(36);
  //let likes = 50;
  let person = { name: "Saul", age: 36, isCool: true };
  //let link = "http://www.google.com";

  //react to click events with e - the event itself, can be passed in as an argument
  const handleClick = (e) => {
    console.log("hello, ninjas", e);
  };

  const handleClickChange = () => {
    setName("Eric");
    setAge(age + 4);
    console.log(person.name);
  };

  function handleClickAgain(name, e) {
    console.log("hello " + name, e.target);
  }
  return (
    <div className="home">
      <h1>{title}</h1>
      <button onClick={handleClick}>Book Now</button>
      <button onClick={(e) => handleClickAgain("Paul", e)}>
        Click me again
      </button>
      <p>
        {name} is {age} years old
      </p>
      <button onClick={handleClickChange}>Change Name</button>
    </div>
  );
};

export default Home;

// {/* <p>Liked {likes} times</p>
// <p>{person.name}</p>
// <p>{2 + 2 * 9000}</p>
// <p>{[1, 2, 3, 4, 5]}</p>
// <p>{Math.random() * 10}</p>
// <a href={link}>Google</a> */}
