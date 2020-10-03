# ThreeJava
three.js java tea vm bindings

## Usage
Whenever you would call `new THREE.Something()` you need to call the static function `Three.Something()` instead as teavm doesn't allow to bind constructors (afaik). Everything else works as in three.js.
