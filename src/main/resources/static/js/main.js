function saveCoffeeData() {
    fetch('/save', { method: 'POST' })
        .then(response => response.text()) 
        .then(data => {
            if (data === "saved") {
                alert("Changes saved!");
            } else {
                alert("Failed to save changes.");
            }
        })
        .catch(error => console.error("Error:", error));
}