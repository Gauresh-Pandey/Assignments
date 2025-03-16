function addTask() {
    let taskInput = document.getElementById("taskInput");
    let taskText = taskInput.value.trim(); // Get input value

    if (taskText === "") {
        alert("Please enter a task!");
        return;
    }
    let li = document.createElement("li");
    li.textContent = taskText;

    let removeButton = document.createElement("button");
    removeButton.textContent = "Remove";
    removeButton.onclick = function() {
        li.remove();
    };

    li.appendChild(removeButton);
    document.getElementById("taskList").appendChild(li);

    taskInput.value = "";
}