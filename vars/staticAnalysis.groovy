def call(boolean abortPipeline = false) {
    timeout(time: 5, unit: 'MINUTES') {
        sh 'echo "Ejecución de las pruebas de calidad de código"'
    }
    if (abortPipeline) {
        error "Aborto del pipeline según la configuración."
    }
}
