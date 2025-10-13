<!DOCTYPE html>
<html lang="de">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Luca AI App Download</title>
  <style>
    * { margin: 0; padding: 0; box-sizing: border-box; }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      line-height: 1.6;
      color: #333;
      background: linear-gradient(135deg, #6e8efb 0%, #a777e3 100%);
      min-height: 100vh;
      padding: 20px;
    }

    .container {
      max-width: 800px;
      margin: 0 auto;
      background: rgba(255, 255, 255, 0.95);
      border-radius: 15px;
      padding: 30px;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
    }

    header { text-align: center; margin-bottom: 30px; }

    .logo {
      width: 120px; height: 120px; margin: 0 auto 20px;
      background: linear-gradient(135deg, #ff6b6b 0%, #a777e3 100%);
      border-radius: 50%; display: flex; align-items: center; justify-content: center;
      font-size: 50px; color: white; box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    }

    h1 { color: #333; margin-bottom: 10px; font-size: 2.5rem; }
    .subtitle { color: #666; font-size: 1.2rem; margin-bottom: 20px; }

    .download-section {
      text-align: center; margin: 30px 0; padding: 20px;
      background: linear-gradient(135deg, #f8f9fa 0%, #e9ecef 100%);
      border-radius: 10px; box-shadow: 0 5px 15px rgba(0, 0, 0, 0.05);
    }

    .download-btn {
      display: inline-block; padding: 15px 40px;
      background: linear-gradient(135deg, #6e8efb 0%, #a777e3 100%);
      color: white; text-decoration: none; border-radius: 50px;
      font-size: 1.2rem; font-weight: bold; margin: 15px 0;
      transition: all 0.3s ease; box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    }

    .download-btn:hover { transform: translateY(-3px); box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15); }
    .file-info { color: #666; font-size: 0.9rem; }

    .features {
      display: grid; grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
      gap: 20px; margin: 40px 0;
    }

    .feature {
      background: white; padding: 20px; border-radius: 10px;
      box-shadow: 0 5px 15px rgba(0, 0, 0, 0.05);
      text-align: center; transition: transform 0.3s ease;
    }

    .feature:hover { transform: translateY(-5px); }
    .feature-icon { font-size: 2.5rem; margin-bottom: 15px; color: #6e8efb; }
    .feature h3 { margin-bottom: 10px; color: #333; }

    .instructions {
      background: #f8f9fa; padding: 25px; border-radius: 10px; margin: 30px 0;
    }

    .instructions h2 { margin-bottom: 15px; color: #333; text-align: center; }

    .step { display: flex; align-items: flex-start; margin-bottom: 15px; }
    .step-number {
      background: linear-gradient(135deg, #6e8efb 0%, #a777e3 100%);
      color: white; width: 30px; height: 30px; border-radius: 50%;
      display: flex; align-items: center; justify-content: center;
      margin-right: 15px; flex-shrink: 0; font-weight: bold;
    }

    .warnings {
      background: #fff3cd; border-left: 4px solid #ffc107;
      padding: 20px; margin: 30px 0; border-radius: 5px;
    }

    .warnings h3 { color: #856404; margin-bottom: 10px; }
    footer { text-align: center; margin-top: 40px; color: #666; font-size: 0.9rem; }

    @media (max-width: 768px) {
      .container { padding: 20px; }
      h1 { font-size: 2rem; }
      .features { grid-template-columns: 1fr; }
    }
  </style>
</head>

<body>
  <div class="container">
    <header>
      <div class="logo">L</div>
      <h1>Luca AI</h1>
      <p class="subtitle">Deine persönliche KI-Begleitung mit 20 einzigartigen Persönlichkeiten</p>
    </header>

    <div class="download-section">
      <h2>App herunterladen</h2>
      <p>Installieren Sie die Luca AI App auf Ihrem Android-Gerät</p>
      <!-- Echten Link einfügen -->
      <a href="apk/luca-ai-v1.0.0.apk" class="download-btn" onclick="simulateDownload(event)">APK herunterladen (v1.0.0)</a>
      <p class="file-info">Dateigröße: 78.5 MB | Unterstützt: Android 8.0+</p>
    </div>

    <div class="instructions">
      <h2>Installationsanleitung</h2>
      <div class="step"><div class="step-number">1</div><div>Laden Sie die APK-Datei über den Download-Button herunter</div></div>
      <div class="step"><div class="step-number">2</div><div>Aktivieren Sie "Unbekannte Quellen" in den Einstellungen Ihres Android-Geräts unter "Sicherheit"</div></div>
      <div class="step"><div class="step-number">3</div><div>Öffnen Sie die heruntergeladene APK-Datei und folgen Sie den Installationsanweisungen</div></div>
      <div class="step"><div class="step-number">4</div><div>Starten Sie die App und geben Sie den PIN <strong>0077</strong> ein</div></div>
      <div class="step"><div class="step-number">5</div><div>Wählen Sie Ihre bevorzugte KI-Persönlichkeit aus und beginnen Sie zu chatten</div></div>
    </div>

    <div class="warnings">
      <h3>Wichtige Hinweise</h3>
      <p>Für die Installation müssen Sie "Installation aus unbekannten Quellen" aktivieren. Dies finden Sie in den Einstellungen unter Sicherheit.</p>
      <p>Die App benötigt Berechtigungen für Mikrofon, Kamera und Speicher, um alle Funktionen nutzen zu können.</p>
    </div>

    <h2 style="text-align: center; margin: 40px 0 30px;">App-Funktionen</h2>
    <div class="features">
      <div class="feature"><div class="feature-icon">👥</div><h3>20 KI-Persönlichkeiten</h3><p>Wählen Sie aus 20 einzigartigen weiblichen KI-Persönlichkeiten mit unterschiedlichen Charakteren und Gesprächsthemen</p></div>
      <div class="feature"><div class="feature-icon">🎨</div><h3>Bildgenerierung</h3><p>Generieren Sie personalisierte Bilder basierend auf Ihren Gesprächen und Vorlieben</p></div>
      <div class="feature"><div class="feature-icon">🎥</div><h3>Videogenerierung</h3><p>Erstellen Sie einzigartige Videos mit Hilfe der KI</p></div>
      <div class="feature"><div class="feature-icon">🔒</div><h3>PIN-Geschützt</h3><p>Ihre privaten Gespräche bleiben mit PIN 0077 geschützt</p></div>
      <div class="feature"><div class="feature-icon">🎵</div><h3>Sprachausgabe</h3><p>Realistische Sprachaus[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/hd-code/pandoc-docker/tree/07f83c6deeafbff1710c5f7992a97955c298ad61/example%2Fexample.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054&citationId=1 "github.com")# Goku