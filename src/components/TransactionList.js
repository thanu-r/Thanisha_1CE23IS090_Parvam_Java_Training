// src/components/TransactionList.js

// Import React and necessary hooks
import React, { useEffect, useState } from "react";
// Import an API utility to make HTTP requests
import api from "../api";

// Define a functional React component
export default function TransactionList() {
  const [transactions, setTransactions] = useState([]);
  const [members, setMembers] = useState([]);
  const [games, setGames] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetchAll();
  }, []);

  async function fetchAll() {
    setLoading(true);
    try {
      const [tRes, mRes, gRes] = await Promise.all([
        api.get("/transactions"),
        api.get("/members"),
        api.get("/games"),
      ]);

      setTransactions(tRes.data?.data || []);
      setMembers(mRes.data?.data || []);
      setGames(gRes.data?.data || []);
    } catch (err) {
      alert("Error loading transactions: " + (err.message || err));
    } finally {
      setLoading(false);
    }
  }

  const memberMap = Object.fromEntries(
    (members || []).map((m) => [m.memberId, m.name])
  );
  const gameMap = Object.fromEntries(
    (games || []).map((g) => [g.gameId, g.gameName])
  );

  return (
    <div
      style={{
        padding: "40px 20px",
        minHeight: "100vh",
        background: "#f1f5f9",
        fontFamily: "Inter, sans-serif",
      }}
    >
      <div
        style={{
          maxWidth: 900,
          margin: "0 auto",
          background: "#fff",
          borderRadius: 16,
          boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
          padding: 24,
        }}
      >
        <h2
          style={{
            fontSize: 22,
            fontWeight: 700,
            color: "#1e3a8a",
            textAlign: "center",
            borderBottom: "2px solid #3b82f6",
            paddingBottom: 8,
            marginBottom: 20,
          }}
        >
          🎮 Transaction History
        </h2>

        {loading ? (
          <p
            style={{
              textAlign: "center",
              color: "#475569",
              fontSize: 16,
            }}
          >
            Loading transactions...
          </p>
        ) : (
          <div
            style={{
              overflowX: "auto",
              borderRadius: 8,
              border: "1px solid #e2e8f0",
              background: "#f8fafc",
            }}
          >
            <table
              width="100%"
              cellPadding="10"
              style={{
                borderCollapse: "collapse",
                fontSize: 14,
                width: "100%",
              }}
            >
              <thead style={{ background: "#dbeafe", color: "#1e3a8a" }}>
                <tr>
                  <th align="left">ID</th>
                  <th align="left">Member</th>
                  <th align="left">Game</th>
                  <th align="left">Play Hrs</th>
                  <th align="left">Cost</th>
                  <th align="left">Date</th>
                </tr>
              </thead>
              <tbody>
                {transactions.length === 0 ? (
                  <tr>
                    <td
                      colSpan="6"
                      style={{
                        textAlign: "center",
                        padding: 16,
                        color: "#64748b",
                      }}
                    >
                      No transactions found
                    </td>
                  </tr>
                ) : (
                  transactions.map((tx, i) => (
                    <tr
                      key={tx.transactionId}
                      style={{
                        background: i % 2 === 0 ? "#fff" : "#f1f5f9",
                        borderBottom: "1px solid #e2e8f0",
                      }}
                    >
                      <td>{tx.transactionId}</td>
                      <td>{memberMap[tx.memberId] ?? tx.memberId}</td>
                      <td>{gameMap[tx.gameId] ?? tx.gameId}</td>
                      <td>{tx.playTimeHrs}</td>
                      <td
                        style={{
                          color: "#16a34a",
                          fontWeight: "bold",
                        }}
                      >
                        ₹{tx.cost}
                      </td>
                      <td>
                        {tx.transactionDate
                          ? new Date(tx.transactionDate).toLocaleString()
                          : "-"}
                      </td>
                    </tr>
                  ))
                )}
              </tbody>
            </table>
          </div>
        )}
      </div>
    </div>
  );
}