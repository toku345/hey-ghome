# hey-ghome
To talk Google Home from ClojureScript REPL or console.


## Features

This project provides:

- `say` function
- `say` cli command


# Requirement

This project heavily dependent on shadow-cljs.

- node.js (v6.0.0+)
- npm or yarn
- Java SDK (Version 8+)

# Installation

    $ git clone https://github.com/toku345/hey-ghome.git
    $ cd hey-ghome
    $ npm install

## Generate `say` command

    $ npx shadow-cljs release app
    $ chmod +x bin/say
    $ ./bin/say "<String to talk Google Home>"

## Repl

Console:

    $ npx shadow-cljs cljs-repl app
    $ npx shadow-cljs node-repl
    shadow-cljs - config: /path/to/cljs/hey-ghome/shadow-cljs.edn  cli version: 2.7.8  node: v10.8.0
    shadow-cljs - connected to server
    [1:1]~app.core=> (say "<String to talk Google Home>")

or

Use cider.
