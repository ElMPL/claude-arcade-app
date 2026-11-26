# ClaudeArcade para Android

App **no oficial** que abre [ClaudeArcade](https://claude-arcade.onrender.com), la plataforma de juegos hechos con Claude, como una app del celular.

- **Bajar:** [claude-arcade.apk](https://github.com/ElMPL/claude-arcade-app/releases/latest/download/claude-arcade.apk)

## Instalar
1. Abrí el enlace desde el celular y bajá el APK.
2. Abrilo. Android pide permiso para instalar apps de esa fuente: aceptalo.

## Qué hace
- Abre la plataforma en vivo, con todos sus juegos y salas online.
- Si el servidor gratuito está dormido, espera y reintenta solo mientras despierta (hasta un minuto).
- Los enlaces a otros sitios se abren en el navegador.

## Actualizaciones
- **La plataforma y sus juegos** se actualizan solos: la app muestra siempre la página en vivo.
- **La app:** cada cambio en `android/` compila un APK nuevo (pestaña *Actions* → *APK*) y lo publica en *Releases*. La app lo detecta al abrirse y ofrece instalarlo.

## Cómo está armado
`android/` tiene la app (una WebView). Se compila con `android/build.sh` en GitHub Actions y se firma con los secretos `KS_B64` y `KS_PASS`, que tienen que ser siempre los mismos para que las actualizaciones se instalen encima.
