function init () {
    const missionAbort = document.getElementById("abortMission");
    const button = document.getElementById("liftoffButton");
    const paragraph = document.getElementById("statusReport");
    button.addEventListener("click",function(event){
        console.log('take off clicked');
        paragraph.innerHTML = "Houston, we have liftoff!";
        element.innerHTML = "Okay, you clicked me geeze";
    });
    missionAbort.addEventListener("mouseover", function(event) {
        let element = event.target;
        element.style.backgroundColor = "red";
    });
    missionAbort.addEventListener("mouseout", function(event) {
        let element = event.target;
        element.style.backgroundColor = "";
    });
    missionAbort.addEventListener("click", function(){
       const confirmation = confirm("Are you sure you want to abort the mission?");
       if (confirmation) {
        confirm("Mission aborted! Space shuttle returning home.");
       }
    });
    

}

window.addEventListener("load", init);