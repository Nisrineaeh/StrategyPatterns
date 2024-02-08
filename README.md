# StrategyPatterns

Modèle de conception comportemental qui permet de définir une famille d'algorithmes, les encapsule séparément et les rend interchangeables. Dans notre cas, chaque mode de paiement est un 'algorithme' qui peut être utilisé de façon interchangeable dans le système de paiement.

## Contexte

L'exercice consiste à créer un système de paiement simple où le mode de paiement peut varier. Cela inclut, mais n'est pas limité à, les paiements par carte, PayPal, ou crypto-monnaie. L'objectif est d'appliquer le Strategy Pattern pour permettre une flexibilité et une extensibilité dans les modes de paiement.