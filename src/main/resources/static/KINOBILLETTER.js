function formSubmit() {
    const billett = {
        etternavn: $("#etternavn").val(),
        fornavn: $("#fornavn").val(),
        film: $("#film").val(),
        antall: $("#antall").val(),
        mobilnummer: $("#mobilnummer").val(),
        epost: $("#epost").val(),
    };

    const mobilnummerRegex = /^[0-9]{3} [0-9]{2} [0-9]{3}|[0-9]{8}$/;
    if (!mobilnummerRegex.test(Billett.mobilnummer)) {
        alert("Skriv et gyldig mobilnummer (8 siffer)");
        return;
    }

    const epostRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!epostRegex.test(Billett.epost)) {
        alert("Skriv en gyldig epostadresse");
        return;
    }

    $.post("/lagre", Billett, function () {
        hentAlle();
    });
}

function hentAlle() {
    $.get("/hentAlle", function (Billett) {
        formatBilletter(Billett);
    });
}

function formatBilletter(Billett) {
    let output = `
        <table>
            <tr>
                <th>Film</th>
                <th>Epost</th>
                <th>Etternavn</th>
                <th>Mobilnummer</th>
                <th>Antall</th>
                <th>Fornavn</th>
            </tr>`;

    for (const billett of Billett) {
        output += `
            <tr>
                <td>${billett.epost}</td>
                <td>${billett.fornavn}</td>
                <td>${billett.film}</td>
                <td>${billett.antall}</td>
                <td>${billett.mobilnummer}</td>
                <td>${billett.etternavn}</td>   
            </tr>`;
    }

    output += "</table>";
    $("#BillettContainer").html(output);
}

function slettAlle() {
    $.get("/slettAlle", function () {
        hentAlle();
    });
}