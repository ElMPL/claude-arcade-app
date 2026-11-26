package io.github.elmpl.claudearcade;

/** Lo único que cambia entre la app de ClaudeArcade y la del juego. */
final class Config {
    /** Página que abre la app: la plataforma en vivo (siempre la versión actual, con todos los juegos). */
    static final String START = "https://claude-arcade.onrender.com/";
    /** Enlaces de este sitio se quedan en la app; el resto se abre en el navegador. */
    static final String HOST = "claude-arcade.onrender.com";
    static final String PATH = "/";
    /** Repo donde se publican las versiones nuevas del APK. */
    static final String REPO = "ElMPL/claude-arcade-app";
    /** Nombre del APK en cada versión publicada. */
    static final String APK = "claude-arcade.apk";
    static final String UA = "ClaudeArcadeApp";
    static final String NAME = "ClaudeArcade";
    static final int BG = 0xFF14102A;
    static final int ACCENT = 0xFFFFCC00;
    /** Con barras del sistema, para que el teclado no tape los campos de nombre y código de sala. */
    static final boolean IMMERSIVE = false;
    /** "Atrás" vuelve a la página anterior. */
    static final boolean GAME_BACK = false;
    /** Seguir conectado a la sala si salís un momento de la app. */
    static final boolean PAUSE_IN_BACKGROUND = false;
    /** El servidor gratuito se duerme: reintentar mientras despierta. */
    static final boolean AUTO_RETRY = true;
    static final String SLOW = "Despertando el servidor… la primera vez del día puede tardar hasta un minuto.";
    static final String OFFLINE = "No hay conexión. ClaudeArcade necesita internet.";

    private Config() { }
}
