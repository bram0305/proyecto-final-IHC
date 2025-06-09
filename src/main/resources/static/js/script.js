function leerPagina() {
    const boton = document.querySelector('[data-lector-texto]');
    const texto = boton.getAttribute('data-lector-texto');
    
    const utterance = new SpeechSynthesisUtterance(texto);
    utterance.lang = "es-ES";
    window.speechSynthesis.speak(utterance);
}